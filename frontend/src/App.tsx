import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Button, ThemeProvider } from "@mui/material";
import Navbar from "./customer/components/Navbar/Navbar";
import customeTheme from "./customer/Theme/customeTheme";
import Home from "./customer/pages/Home/Home";
import Product from "./customer/pages/Product/Product";
import ProductDetails from "./customer/pages/Page Details/ProductDetails";
import Review from "./customer/pages/Review/Review";
import Cart from "./customer/pages/Cart/Cart";
import Checkout from "./customer/pages/Checkout/Checkout";
import Account from "./customer/pages/Account/Account";
import { Route, Routes } from "react-router-dom";
import BecomeSeller from "./customer/pages/Become Seller/BecomeSeller";
import SellerDashboard from "./customer/seller/pages/SellerDashboard/SellerDashboard";

function App() {
  return (
    <div className="">
      <ThemeProvider theme={customeTheme}>
        <div>
          <Navbar />
          {/* <Home /> */}
          {/*  <Product /> */}
          {/* <ProductDetails /> */}
          {/* <Review /> */}
          {/* <Cart /> */}
          {/* <Checkout /> */}
          {/*  <Account /> */}

          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/products/:category" element={<Product />} />
            <Route path="/reviews/:productId" element={<Review />} />
            <Route
              path="/product-details/:categoryId/:name/:productId"
              element={<ProductDetails />}
            />
            <Route path="/cart" element={<Cart />} />
            <Route path="/checkout" element={<Checkout />} />
            <Route path="/become-seller" element={<BecomeSeller />} />
            <Route path="/account/*" element={<Account />} />
            <Route path="/seller/*" element={<SellerDashboard />} />
          </Routes>
        </div>
      </ThemeProvider>
    </div>
  );
}

export default App;
