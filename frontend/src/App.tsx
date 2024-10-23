import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Button, ThemeProvider } from "@mui/material";
import Navbar from "./customer/components/Navbar/Navbar";
import customeTheme from "./customer/Theme/customeTheme";
import Home from "./customer/pages/Home/Home";

function App() {
  return (
    <div className="">
      <ThemeProvider theme={customeTheme}>
        <div>
          <Navbar />
          <Home />
        </div>
      </ThemeProvider>
    </div>
  );
}

export default App;
