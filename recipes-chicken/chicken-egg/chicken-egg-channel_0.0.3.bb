SECTION = "devel/chicken"
DESCRIPTION = "A reactive channel implementation inspired by lamina for Clojure (https://github.com/ztellman/lamina)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://channel.meta;md5=973d625cd42002f1ba0fa4ccc3def1b4"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/channel/channel-${PV}.tar.gz"

SRC_URI[md5sum] = "c8eff6b772b96491e9e2417d0bb1d415"
SRC_URI[sha256sum] = "9757cff103f99547d5fed6cf7dd645f7b3c560c65ea6f48911e545c1c9f53aea"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
