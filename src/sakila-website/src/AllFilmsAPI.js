import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

function GetAllFilms(){
    const [Error, SetError] = useState(null);
    const [Films, SetFilms] = useState([]);
    
    function LoadFilms(){
        const PageContent = [];
        Films.forEach(Element => {
            PageContent.push(
            <><div>
                    {Element.title}: {Element.rentalRate}
                    <Link to={"/FilmPage/" + Element.filmId}>
                        <button>Rent</button></Link>
                </div><p>{Element.description}</p></>)
        });
        return(
            PageContent
        );
    }

    useEffect(() => {
        fetch("http://localhost:8080/Home/allFilms")
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
            <div>Films
                
                <div id="Films">{Films !== [] ? LoadFilms() : null}</div>
                <hr></hr>
                <div>NOTE you will be charged rent by the minuite</div>
            </div>
        )
    }
}


export default GetAllFilms;