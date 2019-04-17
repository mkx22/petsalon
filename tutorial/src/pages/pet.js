import react,{Component} from 'react';
import display from '../assets/pet.png';
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
class petList extends Component{
  componentDidMount(){
    this.props.fetch();
  }
  render(){
    const data1 = [
      {
        title: 'Pet 1',
        description: 'description1'
      },
      {
        title: 'Pet 2',
        description: 'description2'
      },
      {
        title: 'Pet 3',
        description: 'description3'
      },
      {
        title: 'Pet 4',
        description: 'description4'
      },
    ];

//    const data1 = this.props.list.data1===undefined?[]:this.props.list.data1;//incase data is not passed from backend
    return (
      <div className={styles.list}>
        <List
          itemLayout="horizontal"
          dataSource={data1}
          renderItem={item => (
            <List.Item actions={[<a href="/list">owner</a>,<a href="/service">service</a>,<Link to="/">Back to index</Link>]}>
              <List.Item actions={[<b href="/d">delete</b>,<b href="/u">update</b>]}>
              <List.Item.Meta
                avatar={<Avatar src={display} />}
                title={<b href="title">{item.title}</b>}
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

export default petList;
