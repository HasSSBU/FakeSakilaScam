import React, { useEffect } from 'react';
import {useState} from 'react';

function GetAllFilms(){
    const [error, setError] = useState(null);
    const [films, setFilms] = useState([]);
    
    function LoadFilms(){
        const pageContent = [];
        films.forEach(element => {
            pageContent.push(<div>{element.title}: {element.rentalRate} <button>Rent</button></div>,
                    <p>{element.description}</p>)
        });
        return(
            pageContent
        );
    }

    useEffect(() => {
        fetch("http://localhost:8080/Home/allFilms")
        .then(res => res.json())
        .then(FilmList =>{      
            setFilms(FilmList);
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
                
                <div id="Films">{films !== [] ? LoadFilms() : null}</div>
                <br></br>
            </div>
        )
    }
}


export default GetAllFilms;