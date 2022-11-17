import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Routes, Route, BrowserRouter } from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import FilmPage from "./pages/FilmPage";
import PaymentPage from "./pages/PaymentPage";
import EndPage from './pages/EndPage';
// import ExtraPage from './pages/ExtraPage';
import NavBar from './NavBar';



export default function App(){
  return(
    <BrowserRouter>
      <Routes>
      <Route path="/" element={<Layout/>}>
        <Route index element={<Home/>}/>
        <Route path="FilmPage/:Id" element={<FilmPage/>}/>
        <Route path="PaymentPage/:Id" element={<PaymentPage/>}/>
        <Route path="EndPage/:Id" element={<EndPage/>}/>
        {/* <Route path="ExtraPage/" element={<ExtraPage/>}/> */}
      </Route>
      </Routes>
    </BrowserRouter>
  );
}

//ReactDOM.render(<div><App /></div>, document.getElementById("root"));

// import GetAllFilms from './AllFilmsAPI.js';
// import Head from './homepage.js';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<div><App/></div>);
//   <React.StrictMode>
//     <Head/>
//     <GetAllFilms/>
//   </React.StrictMode>
// );
