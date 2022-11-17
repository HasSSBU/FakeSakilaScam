import React from 'react';
import { useLocation, useParams } from 'react-router-dom';
import GetFilmForPayment from '../FilmPayment.js';
import '../index.css';

function PaymentPage(){
    let Param = useParams();
    return(
        <div>
            
            <GetFilmForPayment Id={Param.Id} /> 
        </div>
    );
}

export default PaymentPage;