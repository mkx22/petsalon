import React,{Component} from 'react';
import styles from './index.css';
import {Button,Tag} from 'antd';
import {connect} from 'dva';//注册器

const typeMap = ["dashed","normal","danger","primary"];

class MyButton extends Component{
  // state = {
  //   type: "dashed",
  //   count: 0,
  // }

  render(){
    return (
      <Button type={this.props.type} onClick={()=>{
        let count=this.state.count;
        this.setState({type:typeMap[count%4],count: count+1})}
      }>
      Click Me
      </Button>
    )
  }
}

const mapStateToProps = (state) =>{//把dva对象里的东西映射到props里
  return{

  }
}

const mapDispatchToProps = (dispatch) =>{
  return {

  }
}

@connect(mapStateToProps,mapDispatchToProps)//connnect传递参数
class MyPage extends Component{
  render(){
//    console.log(this.props.my);
    return(
    <div className={styles.normal}>
    <ul className={styles.list}>
    <MyButton/>
    <Tag color="line">{this.state.count}</Tag>
    </ul>
    </div>
    )
  }
}
  
export default MyButton;
