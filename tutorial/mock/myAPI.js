function getclickcount(req,res){
    console.log("succeeded");
    return res.json(["1","2","3"]);
}

const data = [
    {
      title: 'Owner 1',
      description: 'description1'
    },
    {
      title: 'Owner 2',
      description: 'description2'
    },
    {
      title: 'Owner 3',
      description: 'description3'
    },
    {
      title: 'Owner 4',
      description: 'description4'
    },
];
// const data1 = [
//   {
//     title: 'Pet 1',
//     description: 'description1'
//   },
//   {
//     title: 'Pet 2',
//     description: 'description2'
//   },
//   {
//     title: 'Pet 3',
//     description: 'description3'
//   },
//   {
//     title: 'Pet 4',
//     description: 'description4'
//   },
// ];

export default{
    'GET /api/get': getclickcount,
    'GET /api/fetch': data,

}
