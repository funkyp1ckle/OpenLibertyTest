import {ReactNode} from "react";
import '../css/Card.css'

interface Props {
    children: ReactNode
}

function Card(props : Props) {
    return (
        <div className='card'>test</div>
    );
}

export default Card;