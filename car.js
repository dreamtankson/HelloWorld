car.js
$(function(){
    // 全选 全不选 功能模块
    // 就是把全选按钮checkall的状态赋值给三个小的按钮 j-checkbox 就可以了
    // 事件可以使用change
    $(".checkall").change(function(){
        $(".j-checkall,.checkall").prop("checked",$(this).prop("checked"));
    });
    $(".j-checkbox").change(function(){
        if($(".j-checkbox:checked").length === $(".j-checkbox").length) {
            $(".checkall").prop("checked",true);
        }else {
            $(".checkall").prop("checked",false);
        }
    });
    


})