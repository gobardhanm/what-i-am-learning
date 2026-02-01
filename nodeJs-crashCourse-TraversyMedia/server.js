import http from 'http';
const PORT = process.env.PORT;
import url from 'url';
import fs from 'fs/promises';
import path from 'path';

const __filename = url.fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// console.log(__filename, __dirname);


const server = http.createServer(async (req,res)=>{
    // Check if GET request
    try {
        if(req.method === 'GET'){
            let filePath;
            if(req.url === '/'){
                filePath = path.join(__dirname, 'public', 'index.html');
            }
            else if(req.url === '/about'){
                filePath = path.join(__dirname, 'public', 'about.html');
            }
            else{
                throw new Error('Not Found!')
            }

            const data = await fs.readFile(filePath);
            res.setHeader('Content-Type', 'text/html');
            res.write(data);
            res.end();
        }
        else{
         throw new Error('Method not allowed');   
        }
    } catch (error) {
        res.writeHead(500,{'Content-Type': 'text/html'});
        res.end('<h1>Server Error, Baby!</h1>');
    }

    

});

server.listen(PORT, () => {
    console.log(`Server running on port: ${PORT}`);
});
