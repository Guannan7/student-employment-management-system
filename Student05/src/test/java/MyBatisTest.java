import com.yfh.dao.IClassMapper;
import com.yfh.dao.IStudentMapper;
import com.yfh.pojo.IClass;
import com.yfh.pojo.IStudent;
import com.yfh.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
    @Test
    public void  findIStudentByIdTest(){
        // 1.通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        IStudentMapper mapper=session.getMapper(IStudentMapper.class);
        IStudent student=mapper.a(2);
        System.out.println(student.toString());
        session.close();
    }

    @Test
    public void updateStudent(){
        // 1.通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        IStudent iStudent =new IStudent();
        iStudent.setId(6);
        iStudent.setName("李雷");
        iStudent.setAge(21);
        IStudentMapper mapper=session.getMapper(IStudentMapper.class);
        int result=mapper.updateStudent(iStudent);
        if (result>0){
            System.out.println("操作成功");
        }else {
            System.out.println("操作失败");
        }
        System.out.println(iStudent.toString());
        session.close();
    }
    @Test
    public void selectClassByIdTest(){
        SqlSession session = MyBatisUtils.getSession();
        IClassMapper mapper=session.getMapper(IClassMapper.class);
        IClass iClass=mapper.selectClassById(2);
        System.out.println(iClass.toString());
        session.close();
    }

}
