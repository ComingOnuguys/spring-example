package org.example.windyang;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import org.example.windyang.dao.CmsSubjectMapper;
import org.example.windyang.pojo.CmsSubject;
import org.example.windyang.pojo.CmsSubjectExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@Slf4j
public class MybatisTest {

    @Autowired
    private CmsSubjectMapper cmsSubjectMapper;

    @Test
    public void  testSelect(){
        List<CmsSubject> cmsSubjects = cmsSubjectMapper.selectByExample(new CmsSubjectExample());
        log.info("cmsSubjects={}", JSONUtil.toJsonStr(cmsSubjects));
    }

}
