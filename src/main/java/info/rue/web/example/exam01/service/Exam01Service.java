/**
 * 
 */
package info.rue.web.example.exam01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.rue.web.example.exam01.mapper.Exam01Mapper;

/**
 * @author rue
 *
 */
@Service
public class Exam01Service {

    @Autowired
    Exam01Mapper exam01Mapper;

    public String dbTest() {
        return exam01Mapper.dbTest();
    }
}
