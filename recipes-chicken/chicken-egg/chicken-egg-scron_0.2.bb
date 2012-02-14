SECTION = "devel/chicken"
DESCRIPTION = "A very simple cron program"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scron.meta;md5=e89ac6259a4642fb0199f72c0aeb37cf"

PR = "r1"

inherit chicken_install update-rc.d

INITSCRIPT_NAME = "scron"
INITSCRIPT_PARAMS = "start 90 2 3 4 5 ."

do_install_append() {
    install -d ${D}${INIT_D_DIR}
    install -m 755 ${S}/cron.init ${D}${INIT_D_DIR}/scron
}

BBCLASSEXTEND = "cross"
