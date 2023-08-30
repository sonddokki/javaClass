package kr.co.himedia.utilitiesinterface.userinfo.dao.mysql;

import kr.co.himedia.utilitiesinterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesinterface.userinfo.dao.UserInfoDAO;

//UserInfoDAO 인터페이스를 구현한 Oracle 버전 DAO
public class MySQLDAOImpl implements UserInfoDAO {
	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		String userId = userInfoDTO.getUserId(); // 매개변수 suerInfoDTO를 통해 메서드 사용 가능
		System.out.println("insert into MySQL DB userId = " + userId);
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		String userId = userInfoDTO.getUserId();
		System.out.println("update into MySQL DB userId = " + userId);
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		String userId = userInfoDTO.getUserId();
		System.out.println("delete into MySQL DB userId = " + userId);
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		String userId = userInfoDTO.getUserId();
		System.out.println("select into MySQL DB userId = " + userId);
	}
}