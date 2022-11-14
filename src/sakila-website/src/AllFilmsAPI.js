import React, { useEffect } from 'react';
import {useState} from 'react';

function GetAllFilms(){
    const [error, setError] = useState(null);
    const [films, setFilms] = useState("");

    useEffect(() => {
        fetch("http://localhost:8080/Home/allFilms")
        .then(res => res.json())
        .then(FilmList =>{
            setFilms(FilmList[0].title);
        },
        error => {
            setError(error);
        }
        )
    },[])
    if(error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>Films
                <br></br>
                <div id="Films">{films}</div>
            </div>
        )
    }
}

export default GetAllFilms;