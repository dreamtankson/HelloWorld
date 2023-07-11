
SELECT * FROM emp
	WHERE hiredate > '1992-01-01'

SELECT ename, sal FROM emp
	WHERE ename LIKE 'S%'

SELECT ename, sal FROM emp
	WHERE ename LIKE '__O%'

-- ■ 如何显示没有上级的雇员的情况
SELECT * FROM emp
	WHERE mgr IS NULL;
-- ■ 查询表结构 
DESC emp 

-- 使用order by子句

SELECT * FROM emp
	ORDER BY sal 


SELECT * FROM emp
	ORDER BY deptno ASC , sal DESC;

