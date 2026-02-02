import {createServer} from 'http';
const PORT = process.env.PORT;

const user = [
    {id:1, name: 'John Doe'},
    {id:2, name: 'Jean Doe'},
    {id:3, name: 'Jim Doe'},
];

const server = createServer((req,res)=>{
    if(req.url === '/api/user' && req.method === 'GET'){
        res.setHeader('Content-Type', 'appplication/json');
        res.write(JSON.stringify(user));
        res.end();
    }else if(req.url.match(/\/api\/user\/([0-9]+)/) && req.method === 'GET'){
        const id = req.url.split('/')[3];
        const userr = user.find((userr)=> userr.id === parseInt(id));

        res.setHeader('Content-Type', 'appplication/json');
        if(userr){
            res.write(JSON.stringify(userr));
        }else{
            res.statusCode = 404;
            res.write(JSON.stringify({message: 'User not found !'}));
        }
        res.end();
    }else{
        res.setHeader('Content-Type', 'appplication/json');
        res.statusCode = 404;
        res.write(JSON.stringify({message: 'Route not found !'}));
        res.end();
    }
});

server.listen(PORT, ()=>{
    console.log(`Server running on ${PORT}`);
    
});