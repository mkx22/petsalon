import { Button } from 'antd'

function printlog(){
  console.log("1");
}

export default function() {
  return (
    <div>
      <ul>
        <h1 style={{color:"blue"}}>Mu</h1>
          <a href="http://localhost:8000/">
            Back to '/'
          </a>
          <Button type="danger" onClick={printlog}>Bang</Button>
      </ul>
    </div>
  );
}
