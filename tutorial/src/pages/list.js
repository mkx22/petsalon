import react,{Component} from 'react';
import display from '../assets/paw.png';
import {List,Avatar} from 'antd';
import styles from './index.css';
import Link from 'umi/link';
import {connect} from 'dva';
const mapStateToProps = (state) =>{
  return {
    list: state.list
  }
}

const mapDispatchToProps = (dispatch) =>{
  return {
    // click: ()=>dispatch({type:"typecount/click",payload:{photo:"clothes"}}),
    fetch: ()=>dispatch({type:"list/fetchData"})
  }
}

@connect(mapStateToProps,mapDispatchToProps)
class myList extends Component{
  componentDidMount(){
    this.props.fetch();
  }
  render(){
//    const data=[]
    const data = this.props.list.data===undefined?[]:this.props.list.data;//incase data is not passed from backend
    return (
    <div className={styles.list}>
      <List
        itemLayout="horizontal"
        dataSource={data}
        renderItem={item => (
          <List.Item actions={[<a href="/pet">pet</a>,<a href="/service">service</a>,<Link to="/">Back to index</Link>]}>
            <List.Item actions={[<b href="/d">delete</b>,<b href="/u">update</b>]}>
            <List.Item.Meta
              avatar={<Avatar src={display} />}
              title={<b href="">{item.title}</b>}
              description={item.description}
            />
          </List.Item>
          </List.Item>
        )}
      />
    </div>
    )
  }
}

export default myList;
