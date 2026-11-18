import { useState } from "react"
import {genTicket , sum} from "./helper"
import TicketNum from "./TicketNum";
import Ticket from "./Ticket";


export default function Lottery({n, winCondition}) {
    let [ticket, setTicket] = useState(genTicket(n));
    let isWinning = winCondition(ticket) ;

    let byTicket = () => {
        setTicket(genTicket(n))
    }
     return(
        <div>
            <h1>Lottery Game</h1>
            <Ticket ticket={ticket}/>
            <br />

            <button onClick={byTicket}>By a new ticket</button>

            <h3> sum of 3 numbers: {sum(ticket) }</h3>
            <h3>{isWinning && "congratulatin you win the lottery" }</h3>
        </div>
    )
}