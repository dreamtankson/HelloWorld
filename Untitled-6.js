//渲染加载数据
function load(){
    var data = getDate();
    console.log(data);
    // 遍历之前先要清空ol里面的元素内容
    $("ol").empty();
    // 遍历这个数据
    $.each(data,function(i,n){
        $("ol").prepend("<li><input type = 'checkbox' > <p> </p><a href = 'javascript:;'></a></li>")
    })
}