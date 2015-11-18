SECTION = "devel/chicken"
DESCRIPTION = "Procedures for generating logs of run traces of programs"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://simple-logging.meta;md5=d1e8ec8d58c688dc640c1e29693cfb63"
DEPENDS_append_class-cross = " chicken-egg-format-compiler-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-compiler-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format-compiler chicken-egg-format-compiler-crosssdk"
DEPENDS = " chicken-egg-format-compiler chicken-egg-format-compiler-cross"
RDEPENDS_${PN} = " chicken-egg-format-compiler"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-logging/simple-logging-${PV}.tar.gz"

SRC_URI[md5sum] = "8ad43eaa8b58b421e91ef1b1ff7638c9"
SRC_URI[sha256sum] = "39e70ccb3de258e1d10321b9edf79c62e1438e83b8c036b38b0fa39767c2e24a"

S = "${WORKDIR}/simple-logging-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
