SECTION = "devel/chicken"
DESCRIPTION = "A very simple cron program"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scron.meta;md5=e89ac6259a4642fb0199f72c0aeb37cf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "25be2785fcfea8b9dd934a7f91f71c18"
SRC_URI[sha256sum] = "1eb7399ef6c22923ffdeb4951bf23ed132ad4bdfcdc58f8832457bad4954fea1"

S = "${WORKDIR}/${EGG}-${PV}"
PR = "r1"

INITSCRIPT_NAME = "scron"
INITSCRIPT_PARAMS = "start 90 2 3 4 5 ."

do_install_append() {
    install -d ${D}${INIT_D_DIR}
    install -m 755 ${S}/cron.init ${D}${INIT_D_DIR}/scron
}

inherit update-rc.d

inherit chicken_install

BBCLASSEXTEND = "cross"
