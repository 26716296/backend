package com.TypeApi.service.impl;

import com.TypeApi.entity.*;
import com.TypeApi.common.PageList;
import com.TypeApi.dao.*;
import com.TypeApi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层实现类
 * TypechoUsersServiceImpl
 * @author buxia97
 * @date 2021/11/29
 */
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersDao dao;

	@Override
	public int insert(Users users) {
		return dao.insert(users);
	}

	@Override
	public int batchInsert(List<Users> list) {
		return dao.batchInsert(list);
	}

	@Override
	public int update(Users users) {
		return dao.update(users);
	}

	@Override
	public int delete(Object key) {
		return dao.delete(key);
	}

	@Override
	public int batchDelete(List<Object> keys) {
		return dao.batchDelete(keys);
	}

	@Override
	public Users selectByKey(Object key) {
		return dao.selectByKey(key);
	}


	@Override
	public List<Users> selectList(Users users) {
		return dao.selectList(users);
	}

	@Override
	public PageList<Users> selectPage(Users users, Integer offset, Integer pageSize , String searchKey, String order,Integer random) {
		PageList<Users> pageList = new PageList<>();

		int total = this.total(users,searchKey);

		Integer totalPage;
		if (total % pageSize != 0) {
			totalPage = (total /pageSize) + 1;
		} else {
			totalPage = total /pageSize;
		}

		int page = (offset - 1) * pageSize;

		List<Users> list = dao.selectPage(users, page, pageSize,searchKey,order,random);

		pageList.setList(list);
		pageList.setStartPageNo(offset);
		pageList.setPageSize(pageSize);
		pageList.setSearchKey(searchKey);
		pageList.setOrder(order);
		pageList.setTotalCount(total);
		pageList.setTotalPageCount(totalPage);
		return pageList;
	}

	@Override
	public int total(Users users, String searchKey) {
		return dao.total(users,searchKey);
	}
}