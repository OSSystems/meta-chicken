SECTION = "devel/chicken"
DESCRIPTION = "A declarative applicative logic programming system."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://kanren.meta;md5=a67e886797c02b73fb26caf35f245ef8"
DEPENDS_append_class-cross = " chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kanren/kanren-${PV}.tar.gz"

SRC_URI[md5sum] = "778fc7e155f69279a21eb4523908f534"
SRC_URI[sha256sum] = "d07579b4739b9e8092c149c0345966cca15e606bb927139821c433e463305cf4"

S = "${WORKDIR}/kanren-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
