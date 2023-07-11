 
mysqldump -u root -p -B ecshop > d:\\ecshop.sql
#将mysql的ecshop数据库删除, 并通过备份的d:\\ecshop.sql恢复
#进入mysql命令行
source d:\\ecshop.sql