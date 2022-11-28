const setCookie = function (name, value, expiredDay) {
    const expired = new Date();
    expired.setTime(expired.getTime() + expiredDay * 24 * 60 * 60 * 1000);

    document.cookie = name + '=' + encodeURIComponent(value) + ';expires=' + expired.toUTCString() + ';path=/';
};

const getCookie = function (name) {
    var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return value ? decodeURIComponent(value[2]) : null;
};

const deleteCookie = function (name) {
    document.cookie = name + '=; expires=Thu, 01 Jan 1999 00:00:10 GMT;';
}



