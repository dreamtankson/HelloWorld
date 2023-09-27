$(function(){
    $("#title").on("keydown",function(event){
        if(event.keyCode === 13) {
            alert(11);
            var local = getData();
            console.log(local);
        }
    });
    // 读取本地存储数据
    function getData(){
        var data = localStorage.getItem("todolist");
        if(data !== null) {
            return JSON.parse(data);
        } else {
            return [];
        }
    }
})