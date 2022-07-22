$(() => {
    const alinks = $("a");
    alinks.removeClass("active");
    const menuHref = window.location.href.substring("http://localhost:8080".length);
    // $(menuId).addClass("active");
    for (let i = 0; i < alinks.length; i++) {
        const href = $(alinks[i]).attr("href");
        if (href === menuHref) {
            $(alinks[i]).addClass("active")
            if(menuHref.lastIndexOf("/")!==0){
                $(alinks[i]).parent().parent().parent().addClass("menu-open")
            }
        }
    }

})