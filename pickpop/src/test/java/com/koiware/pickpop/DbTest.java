package com.koiware.pickpop;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.ProductVO;
import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;
import com.koiware.pickpop.persistence.AddressDAO;
import com.koiware.pickpop.persistence.ProductDAO;
import com.koiware.pickpop.persistence.SellerDAO;
import com.koiware.pickpop.service.SellerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DbTest {
/*	
 * for just mybatis test
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception {
		try(SqlSession session = sqlFactory.openSession()){
			System.out.println(session);
		} catch(Exception e){
			e.printStackTrace();
		}
	}*/

/*	
 * for just dao test
    @Inject
	private SellerDAO sellerDao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(sellerDao.getTime());
	}
	
	@Test
	public void testInsertSeller() throws Exception {
		SellerVO vo = new SellerVO();
		vo.setIdseller("test");
		vo.setPwseller("1234test~!@#");
		vo.setNameseller("ȫ�浿");
		
		sellerDao.insertSeller(vo);
	}*/
	
	@Inject	private SellerService sellerService;
    @Inject	private SellerDAO sellerDao;
    @Inject private AddressDAO addressDao;

	@Test
	public void testSellerService() throws Exception{
		
		AddressVO address = new AddressVO();
		address.setAddress1("address1");
		address.setAddress2("address2");
		address.setIdcity(1);
		address.setPhone("phone");
		address.setPostalcode("postalcode");
		
		SellerVO seller = new SellerVO();
		seller.setIdseller("idseller1");
		seller.setNameseller("nameseller");
		seller.setPwseller("pwseller");
		seller.setIdaddress(0);

//		sellerService.addSeller(seller, address);
		
		LoginDto login = new LoginDto();
		login.setId(seller.getIdseller());
		login.setPw(seller.getPwseller());
		SellerVO seller1 = sellerDao.getSellerWithIdPw(login);
		seller1.about();
	}
	
	/*@Inject	private ProductDAO productDao;
	
	@Test
	public void testProductService() throws Exception {
		ProductVO product = new ProductVO();
		product.setCountsell(100);
		product.setCountstock(10);
		product.setNameproduct("test");
		product.setNoteproduct("noteproduct");
		product.setPointproduct(777);
		product.setPriceproduct(79000);
		product.setRealsize("realsize");
		
		product.setIdcategorysml(1);
		product.setSeller_id(15);
		
		productDao.insertProduct(product);
	}*/
}
