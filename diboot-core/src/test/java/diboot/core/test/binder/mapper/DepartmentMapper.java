package diboot.core.test.binder.mapper;

import com.diboot.core.mapper.BaseCrudMapper;
import diboot.core.test.binder.entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * 部门Mapper
 * @author mazc@dibo.ltd
 * @version 2018/12/22
 */
@Mapper
public interface DepartmentMapper extends BaseCrudMapper<Department> {

}