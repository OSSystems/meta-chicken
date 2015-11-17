INITSCRIPT_NAME = "scron"
INITSCRIPT_PARAMS = "start 90 2 3 4 5 ."

do_install_append() {
    install -d ${D}${INIT_D_DIR}
    install -m 755 ${S}/cron.init ${D}${INIT_D_DIR}/scron
}

inherit update-rc.d
