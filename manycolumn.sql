

SELECT deptno , job
	FROM emp 
	WHERE ename = 'ALLEN'
	

SELECT * 
	FROM emp
	WHERE (deptno , job) = (
		SELECT deptno , job
		FROM emp 
		WHERE ename = 'ALLEN'
	) AND ename != 'ALLEN'



-- 请查询 和宋江数学，英语，语文   
-- 成绩 完全相同的学生
SELECT * 
	FROM student
	WHERE (math, english, chinese) = (
		SELECT math, english, chinese
		FROM student
		WHERE `name` = '宋江'
	)

SELECT * FROM student;


--
	
