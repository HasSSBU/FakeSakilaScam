import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import './index.css';

function GetAllFilms(){
    const [Error, SetError] = useState(null);
    const [Films, SetFilms] = useState([]);
    
    function LoadFilms(){
        const PageContent = [];
        Films.forEach(Element => {
            PageContent.push(
            <><div id='FilmData'>
                    {Element.title}: {Element.rentalRate}
                    <Link to={"/FilmPage/" + Element.filmId}>
                        <button id='RentButton'>Rent</button></Link>
                </div><p>{Element.description}</p>
                <hr></hr>
            </>
            )
        });
        return(
            PageContent
        );
    }

    useEffect(() => {
        fetch("https://sakilascam-1668596780924.azurewebsites.net//Home/allFilms")
        .then(res => res.json())
        .then(FilmList =>{      
            SetFilms(FilmList);
        },
        Error => {
            SetError(Error);
        }
        )
    },[])
    if(Error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>Our Films
                <hr></hr>
                
                <div id="Films">{Films !== [] ? LoadFilms() : null}</div>
                <hr></hr>
                <div>NOTE you will be charged rent by the minute</div>
            </div>
        )
    }
}


export default GetAllFilms;