package ORM;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept);
	void update(Dept dept);
	void delete(Integer deptno);
	Dept findByDeptno(Integer deptno);
	List<Dept> getAll();
}
