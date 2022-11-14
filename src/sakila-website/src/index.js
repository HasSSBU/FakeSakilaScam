import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Routes, Route, BrowserRouter } from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import FilmPage from "./pages/FilmPage";
import PaymentPage from "./pages/PaymentPage";
import NavBar from './NavBar';
import Head from './homepage.js';

export default function App(){
  return(
    <BrowserRouter>
      <Routes>
      <Route path="/" element={<Layout/>}>
        <Route index element={<Home/>}/>
        <Route path="FilmPage" element={<FilmPage/>}/>
        <Route path="PaymentPage" element={<PaymentPage/>}/>
      </Route>
      </Routes>
    </BrowserRouter>
  );
}

//ReactDOM.render(<div><App /></div>, document.getElementById("root"));

// import GetAllFilms from './AllFilmsAPI.js';
// import Head from './homepage.js';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<div><Head/><App/></div>);
//   <React.StrictMode>
//     <Head/>
//     <GetAllFilms/>
//   </React.StrictMode>
// );
