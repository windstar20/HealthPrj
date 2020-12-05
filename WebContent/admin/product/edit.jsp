<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="gc.entity.Product" %>
<%@ page import="gc.service.ProductListService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>admin page</title>
    <link rel="stylesheet" href="../../CSS/reset.css">
    <link rel="stylesheet" href="../../CSS/admin/product/product-reg.css" />
  </head>
  <body>
    <header id="header" class="header">
      <div class="logo-bar">
        <h1 class="no-display">근처</h1>
        <a href=""><div class="logo"></div></a>
        <ul>
          <li><button class="logout">로그아웃</button></li>
        </ul>
      </div>
      <nav id="nav" class="nav">
        <h1 class="no-display">메뉴</h1>
        <ul>
          <li><a href="#">기본설정</a></li>
          <li><a href="#">상품관리</a></li>
          <li><a href="#">주문관리</a></li>
          <li><a href="#">회원관리</a></li>
          <li><a href="#">게시판관리</a></li>
          <li><a href="#">고객센터</a></li>
        </ul>
      </nav>
    </header>

    <div id="body" class="body">
      <aside class="aside">
        <h1 class="aside-title">ASIDE</h1>
        <ul class="aside-menu">
          <li>쇼핑몰 상품 관리</li>
          <ul>
            <li><a href="list.html">상품 리스트</a></li>
            <li><a href="">상품 등록</a></li>
            <li><a href="">상품 재고관리</a></li>
          </ul>
          <br />
          <li>트레이닝 센터 관리</li>
          <ul>
            <li><a href="">센터 리스트</a></li>
            <li><a href="">센터 등록</a></li>
            <li><a href="">센터 정보 수정</a></li>
            <!-- <li><a href="">상품 재고관리</a></li> -->
          </ul>
          <br />
          <li>강사 관리</li>
          <ul>
            <li><a href="">강사 리스트</a></li>
            <li><a href="">강사 등록</a></li>
            <li><a href="">강사 정보 수정</a></li>
          </ul>
          <br />
          </ul>
      </aside>
      <!--?=============== body 테이블 ===============-->
      <main id="main-section" class="main-section">
        <div class="main-title">
            <h1>상품 수정</h1>
            <span> home > 상품관리 > 상품리스트 </span>
        </div>
        	<form action="edit" method="post" >
	            <section id="main" class="main">
	            <h1>상품 기본 정보</h1>
	            <table class="product-basic-info product-table">
	                <tr>
	                    <th>상품명</th>
	                    <td>
	                        <input type="text" name="product-name" value="${p.productName}"/>
	                    </td>
	                </tr>
	                <tr>
	                    <th>제조사</th>
	                    <td><input type="text" name="manufacture" value="${p.manufacturer}"></td>
	                </tr>
	                <tr>
	                    <th>브랜드</th>
	                    <td><input type="text" name="brand" value="${p.brand}"></td>
	                </tr>
	                <tr>
	                    <th>모델명</th>
	                    <td><input type="text" name="model" value="${p.productModel}"></td>
	                </tr>
	                <tr>
	                    <th>상품분류</th>
	                    <td><input type="text" name="category" value="${p.category}" ></td>
	                </tr>
	                
	               
	            </table> 
	            
	            <h1>가격 / 판매정보</h1>
	            <table class="product-price-info product-table">
	                <tr>
	                    <th>판매가</th>
	                    <td>
	                        <input type="text" name="price" value="${p.price}"/> 원                           
	                    </td>
	                </tr>
	                <tr>
	                    <th>적립금</th>
	                    <td>
	                        <input type="text" name="save-point" value="${p.savePoint}"/>
	                        <label> point</label>
	                    </td>
	                </tr>
	            </table>
	        
	            <h1>배송정보</h1>
	            <table class="product-delivery-info product-table">
	                <tr>
	                    <th>배송정책</th>
	                    <td>
	                        <input type="radio" name="delivery" value="charge" />
	                        <label>일반배송</label>
	                        <input type="radio" name="delivery" value="free" /> 
	                        <label>무료배송</label>
	                    </td>
	                </tr>
	            </table>
	        
	        
	            <h1>상품 이미지</h1>
	            <table class="product-image-info product-table">
	                <tr>
	                    <th>기본 이미지</th>
	                    <td>                      
	                        <input type="file" name="basic-image" />
	                        <label>권장사이즈(500x500)</label>                                                
	                    </td>
	                </tr>
	                <tr>
	                    <th>추가 이미지</th>
	                    <td>                      
	                        <input type="file" name="add-image" /><label></label>                                                
	                    </td>
	                </tr>
	            </table>
	        
	            <h1>상세 설명</h1>
	            <table class="product-explain-info product-table">
	                <tr>
	                    <th>상품 간략설명</th>
	                    <td>
	                        <input type="text" name="summary-explain" value="${p.summaryExplain}"/>
	                    </td>
	                </tr>
	                <tr>
	                    <th>상세설명</th>
	                    <td>
	                       <textarea rows=10 name="detail-explain" value="${p.detailExplain}"></textarea>
	                    </td>
	                </tr>
	            </table>
	            <div class="application">
            		<input type="hidden" name="id" value="${p.id}" />		                
                    <a href="list">취소</a>         
                    <input type="submit" value="상품수정" />        
	            </div>
	           </section>
	       </form>
        </main>

      
       
    </div>   <!--body div-->        


    <section>
      <footer id="footer" class="footer">
        <h1>푸터</h1>
      </footer>
    </section>
  </body>
</html>
