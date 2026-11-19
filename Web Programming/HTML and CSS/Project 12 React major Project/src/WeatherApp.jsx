import { useState } from "react";
import SearchBox from "./SearchBox";
import InfoBox from "./InfoBox";

export default function WeatherApp() {
    const [weatherInfo , setWeatherInfo] = useState({
            city: "Pune",
            temp: '24.84' ,
            tempMin: 24.84 ,
            tempMax: 24.84 ,
            humidity: 47 ,
            weather: "nice" 
    });

    let updateInfo = (result) => {
        setWeatherInfo(result)
    }
    return(
        <div>
            <h2 style={{textAlign:"center"}}>weather App</h2>
            <SearchBox updateInfo={updateInfo}/>
            <InfoBox info={weatherInfo}/>
        </div>
    )
}