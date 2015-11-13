SECTION = "devel/chicken"
DESCRIPTION = "A simple generic multithreaded tcp-server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tcp-server.meta;md5=d063552b02f332d7d3a4b598dec83cb4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tcp-server/tcp-server-${PV}.tar.gz"

SRC_URI[md5sum] = "ff4476132653b7979b20359ba2db625e"
SRC_URI[sha256sum] = "9a6294ec10b08f4e347984c3ac9271df8d7a7b396a8b9773a594816559b03b27"

S = "${WORKDIR}/tcp-server-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
