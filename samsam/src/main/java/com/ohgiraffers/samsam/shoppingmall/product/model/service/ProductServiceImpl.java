package com.ohgiraffers.samsam.shoppingmall.product.model.service;

import com.ohgiraffers.samsam.shoppingmall.product.model.dao.ProductMapper;
import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> findProductList(String productName) {
        return productMapper.findProductList(productName);
    }

}


//<!DOCTYPE html>
//<html lang="en">
//
//<head>
//    <meta charset="utf-8">
//    <meta content="width=device-width, initial-scale=1.0" name="viewport">
//
//<title>SAMSAM PRODUCT</title>
//    <meta content="" name="description">
//    <meta content="" name="keywords">
//
//    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
//
//    <!-- Favicons -->
//    <link href="bootstrap/assets/img/favicon.png" rel="icon">
//    <link href="bootstrap/assets/img/apple-touch-icon.png" rel="apple-touch-icon">
//
//    <!-- Google Fonts -->
//    <link href="https://fonts.gstatic.com" rel="preconnect">
//    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i%7CNunito:300,300i,400,400i,600,600i,700,700i%7CPoppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
//
//    <!-- Vendor CSS Files -->
//    <link href="bootstrap/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/quill/quill.snow.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
//    <link href="bootstrap/assets/vendor/simple-datatables/style.css" rel="stylesheet">
//
//    <!-- Template Main CSS File -->
//    <link href="bootstrap/assets/css/style.css" rel="stylesheet">
//
//    <!-- =======================================================
//        * Template Name: NiceAdmin
//    * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
//        * Updated: Apr 20 2024 with Bootstrap v5.3.3
//        * Author: BootstrapMade.com
//    * License: https://bootstrapmade.com/license/
//        ======================================================== -->
//
//    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
//    <style>
//        .btn-small-purple {
//    background-color: purple;
//    color: white;
//    transform: scale(0.7); /* 크기를 반으로 줄임 */
//    border: none;
//}
//        .btn-small-purple .badge {
//    background-color: white;
//    color: purple;
//}
//        .btn-small-lightpurple {
//    background-color: #D8BFD8; /* 연보라색 */
//    color: black;
//    transform: scale(0.7); /* 크기를 반으로 줄임 */
//    border: none;
//}
//        .btn-small-lightpurple .badge {
//    background-color: white;
//    color: #D8BFD8;
//}
//    </style>
//</head>
//
//<body>
//
//<!-- ======= Header ======= -->
//<header id="header" class="header fixed-top d-flex align-items-center">
//
//    <div class="d-flex align-items-center justify-content-between">
//        <a href="" class="logo d-flex align-items-center">
//            <img src="assets/img/logo.png" alt="">
//            <span class="d-none d-lg-block">SAMSAM-ADMIN</span>
//        </a>
//        <i class="bi bi-list toggle-sidebar-btn"></i>
//    </div><!-- End Logo -->
//
//
//    <nav class="header-nav ms-auto">
//        <ul class="d-flex align-items-center">
//
//            <li class="nav-item dropdown pe-3">
//
//                <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
//                    <img src="assets/img/profile-img.jpg" alt="Profile" class="rounded-circle">
//                    <span class="d-none d-md-block dropdown-toggle ps-2">SAMSAM-OWNER</span>
//                </a><!-- End Profile Iamge Icon -->
//
//                <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
//                    <li>
//                        <hr class="dropdown-divider">
//                    </li>
//                    <li>
//                        <a class="dropdown-item d-flex align-items-center" href="#">
//                            <i class="bi bi-box-arrow-right"></i>
//<span>Sign Out</span>
//                        </a>
//                    </li>
//
//                </ul><!-- End Profile Dropdown Items -->
//            </li><!-- End Profile Nav -->
//
//        </ul>
//    </nav><!-- End Icons Navigation -->
//
//</header><!-- End Header -->
//
//<!-- ======= Sidebar ======= -->
//<aside id="sidebar" class="sidebar">
//
//    <ul class="sidebar-nav" id="sidebar-nav">
//
//        <li class="nav-item">
//            <a class="nav-link " href="">
//                <i class="bi bi-grid"></i>
//                <span>Dashboard</span>
//            </a>
//        </li><!-- End Dashboard Nav -->
//
//        <li class="nav-item">
//            <a class="nav-link collapsed" data-bs-toggle="collapse" href="#product-section">
//                <i class="bi bi-menu-button-wide"></i><span>상품 관리</span>
//            </a>
//        </li><!-- End Components Nav -->
//
//        <li class="nav-item">
//            <a class="nav-link collapsed" data-bs-target="#forms-nav" data-bs-toggle="collapse" href="#">
//                <i class="bi bi-journal-text"></i><span>회원 관리</span><i class="bi bi-chevron-down ms-auto"></i>
//            </a>
//            <ul id="forms-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
//                <li>
//                    <a href="forms-elements.html">
//                        <i class="bi bi-circle"></i><span>회원 목록 조회</span>
//                    </a>
//                </li>
//                <li>
//                    <a href="forms-layouts.html">
//                        <i class="bi bi-circle"></i><span>메일</span>
//                    </a>
//                </li>
//            </ul>
//        </li><!-- End Forms Nav -->
//
//        <li class="nav-item">
//            <a class="nav-link collapsed" data-bs-target="#tables-nav" data-bs-toggle="collapse" href="#">
//                <i class="bi bi-layout-text-window-reverse"></i><span>주문 관리</span><i class="bi bi-chevron-down ms-auto"></i>
//            </a>
//            <ul id="tables-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
//                <li>
//                    <a href="OrderChange.html">
//                        <i class="bi bi-circle"></i><span>주문 변경</span>
//                    </a>
//                </li>
//                <li>
//                    <a href="OrderFind.html">
//                        <i class="bi bi-circle"></i><span>주문 조회</span>
//                    </a>
//                </li>
//            </ul>
//        </li><!-- End Tables Nav -->
//
//        <li class="nav-item">
//            <a class="nav-link collapsed" data-bs-target="#board-nav" data-bs-toggle="collapse" href="#">
//                <i class="bi bi-bar-chart"></i><span>게시판</span><i class="bi bi-chevron-down ms-auto"></i>
//            </a>
//            <ul id="board-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
//                <li>
//                    <a href="charts-chartjs.html">
//                        <i class="bi bi-circle"></i><span>공지사항</span>
//                    </a>
//                </li>
//                <li>
//                    <a href="charts-apexcharts.html">
//                        <i class="bi bi-circle"></i><span>Q&A</span>
//                    </a>
//                </li>
//            </ul>
//        </li><!-- End Charts Nav -->
//        <li class="nav-heading">창고 관리</li>
//
//        <li class="nav-item">
//            <a class="nav-link collapsed" data-bs-target="#object-nav" data-bs-toggle="collapse" href="#">
//                <i class="bi bi-bar-chart"></i><span>상품</span><i class="bi bi-chevron-down ms-auto"></i>
//            </a>
//            <ul id="object-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
//                <li>
//                    <a href="charts-chartjs.html">
//                        <i class="bi bi-circle"></i><span>재고 조회</span>
//                    </a>
//                </li>
//                <li>
//                    <a href="charts-apexcharts.html">
//                        <i class="bi bi-circle"></i><span>재고 내역 조회</span>
//                    </a>
//                </li>
//                <li>
//                    <a href="charts-apexcharts.html">
//                        <i class="bi bi-circle"></i><span>입/출고</span>
//                    </a>
//                </li>
//            </ul>
//        </li><!-- End Profile Page Nav -->
//    </ul>
//</aside><!-- End Sidebar-->
//
//<main id="main" class="main">
//
//    <div class="pagetitle">
//        <h1>Dashboard</h1>
//        <nav>
//            <ol class="breadcrumb">
//                <li class="breadcrumb-item"><a href="">Home</a></li>
//                <li class="breadcrumb-item active">Dashboard</li>
//            </ol>
//        </nav>
//    </div><!-- End Page Title -->
//
//    <div id="product-section" class="collapse">
//        <!-- Your product management section content here -->
//        <div class="card">
//            <div class="card-body">
//                <h5 class="card-title">상품 관리</h5>
//                <p class="card-text">상품 관리 내용을 여기에 추가하십시오.</p>
//                <!-- Add more content for product management -->
//            </div>
//        </div>
//    </div>
//
//    <!-- Your existing table content here -->
//    <div class="container mt-5">
//<h2>Product Table</h2>
//        <table class="table table-striped">
//            <thead>
//                <tr>
//                    <th>#</th>
//<th>Product Name</th>
//                    <th>Category</th>
//                    <th>Price</th>
//                    <th>Stock</th>
//                    <th>Actions</th>
//                </tr>
//            </thead>
//            <tbody>
//                <tr>
//                    <td>1</td>
//                    <td>Product 1</td>
//                    <td>Category 1</td>
//                    <td>$10.00</td>
//                    <td>100</td>
//                    <td>
//                        <button class="btn btn-small-purple">Edit</button>
//                        <button class="btn btn-small-lightpurple">Delete</button>
//                    </td>
//                </tr>
//                <tr>
//                    <td>2</td>
//                    <td>Product 2</td>
//                    <td>Category 2</td>
//                    <td>$20.00</td>
//                    <td>200</td>
//                    <td>
//                        <button class="btn btn-small-purple">Edit</button>
//                        <button class="btn btn-small-lightpurple">Delete</button>
//                    </td>
//                </tr>
//            </tbody>
//        </table>
//    </div>
//
//</main><!-- End #main -->
//
//<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
//
//<!-- Vendor JS Files -->
//<script src="bootstrap/assets/vendor/apexcharts/apexcharts.min.js"></script>
//<script src="bootstrap/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
//<script src="bootstrap/assets/vendor/chart.js/chart.min.js"></script>
//<script src="bootstrap/assets/vendor/echarts/echarts.min.js"></script>
//<script src="bootstrap/assets/vendor/quill/quill.min.js"></script>
//<script src="bootstrap/assets/vendor/simple-datatables/simple-datatables.js"></script>
//<script src="bootstrap/assets/vendor/tinymce/tinymce.min.js"></script>
//<script src="bootstrap/assets/vendor/php-email-form/validate.js"></script>
//
//<!-- Template Main JS File -->
//<script src="bootstrap/assets/js/main.js"></script>
//
//<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
//<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
//<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
//
//</body>
//
//</html>
