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
         <Account />
        </div>
      </ThemeProvider>
    </div>
  );
}

export default App;
