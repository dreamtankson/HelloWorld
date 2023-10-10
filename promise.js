const p = new Promise(function(resolve,rehect){
    FileSystem.readFile(".resources/为学.mad",(err,data)=>{
        // 判断如果失败
        if(err) reject(err);
        // 如果成功
        resolve(data);
    });
});

p.then(function(valuw){
    console.log(value.toString());
},function(reason){
    console.log("读取失败!!");
});