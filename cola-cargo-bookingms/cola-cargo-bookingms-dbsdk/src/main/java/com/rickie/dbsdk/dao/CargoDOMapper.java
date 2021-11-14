package com.rickie.dbsdk.dao;

import com.rickie.dbsdk.model.CargoDO;
import com.rickie.dbsdk.model.CargoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CargoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    long countByExample(CargoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int deleteByExample(CargoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int insert(CargoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int insertSelective(CargoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    List<CargoDO> selectByExample(CargoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    CargoDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CargoDO record, @Param("example") CargoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CargoDO record, @Param("example") CargoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CargoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CargoDO record);
}