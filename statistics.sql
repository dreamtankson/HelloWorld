
SELECT COUNT(*) FROM student;
-- 统计数学成绩大于90的学生有多少个？
SELECT COUNT(*) FROM student
	WHERE math > 90
-- 统计总分大于250的人数有多少？
SELECT COUNT(*) FROM student
	WHERE (math + english + chinese) > 250
-- count(*) 和 count(列) 的区别 
-- 解释 :count(*) 返回满足条件的记录的行数
-- count(列): 统计满足条件的某列有多少个，但是会排除 为null的情况
CREATE TABLE t15 (
	`name` VARCHAR(20));
INSERT INTO t15 VALUES('tom');
INSERT INTO t15 VALUES('jack');
INSERT INTO t15 VALUES('mary');
INSERT INTO t15 VALUES(NULL);
SELECT * FROM t15;

SELECT COUNT(*) FROM t15; -- 4
SELECT COUNT(`name`) FROM t15;-- 3



SELECT SUM(math) FROM student;

SELECT SUM(math) AS math_total_score,SUM(english),SUM(chinese) FROM student;

SELECT SUM(math + english + chinese) FROM student;

SELECT SUM(chinese)/ COUNT(*)  FROM student;
SELECT SUM(`name`) FROM student;


SELECT AVG(math) FROM student;

SELECT AVG(math + english + chinese) FROM student;


SELECT MAX(math + english + chinese), MIN(math + english + chinese) 
	FROM student;

-- 求出班级数学最高分和最低分
SELECT MAX(math) AS math_high_socre, MIN(math)  AS math_low_socre
	FROM student;


