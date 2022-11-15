import React from 'react';
import { BrowserRouter as Router, Routes, Route, BrowserRouter } from "react-router-dom";
import logo from './logo.png';
import Home from "./pages/Home";

function Head (){
    return(
        <div>
            <img src = {logo} />
            <i>         Rent Fantastic Films!</i>
            <hr></hr>
        </div>
    )
}

export default Head;