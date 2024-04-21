import '../css/Sidebar.css'

import {ReactNode} from "react";

interface Props {
    children: ReactNode
}

function Sidebar(props : Props) {
    return (
        <div className='sidebar'>
            {props.children}
        </div>
    )
}

export default Sidebar;