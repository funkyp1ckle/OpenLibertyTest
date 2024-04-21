import '../css/Sidebar.css'
import {Icon} from "@iconify/react";

function Sidebar() {
    return (
        <div className='sidebar'>
            <ul>
                <li><Icon icon="ph:devices-duotone" width="30px" height="30px" />Devices</li>
                <li><Icon icon="ic:round-notifications" width="30px" height="30px" />Notifications</li>
                <li><Icon icon="ic:baseline-settings" width="30px" height="30px" />Settings</li>
            </ul>
        </div>
    )
}

export default Sidebar;