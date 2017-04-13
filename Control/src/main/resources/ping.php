<head>
<title>Letters</title>
</head>
<?php

if(!$_SERVER['HTTP_X_FORWARDED_FOR'] && !$_SERVER['HTTP_VIA'] && !$_SERVER['HTTP_PROXY_CONNECTION']) {
    echo 'e';
} else if(!$_SERVER['HTTP_X_FORWARDED_FOR']) {
    echo 'a';
} else {
    echo 't';
}
echo '|';
?>