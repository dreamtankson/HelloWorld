const express = require('express');

const app = express();

app.post('/server',(request,response)=>{

    response.setHeader('Access-Control-Allow-Origin','*');

    response.send('HELLO AJAX');

});

app.post(8000,()=>{
    console.log("服务已经启动，8000端口监听中...");
})