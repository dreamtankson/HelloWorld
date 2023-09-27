// toDoList删除操作
$("ol").on("click","a",function(){
    var data = getDate();
    console.log(data);
    // 修改数据
    var index = $(this).attr("id");
    console.log(index);
    data.splice(index,1);
    // 保存本地存储
    saveDate(data);
    // 重新渲染页面
    load();
})