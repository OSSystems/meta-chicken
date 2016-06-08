SECTION = "devel/chicken"
DESCRIPTION = "library to set up Linux TUN/TAP interfaces"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tun.meta;md5=f878d8fde31424a38f6274163cb6f57e"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-socket-cross chicken-egg-ioctl-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-socket-crosssdk chicken-egg-ioctl-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-socket nativesdk-chicken-egg-ioctl chicken-egg-defstruct-crosssdk chicken-egg-socket-crosssdk chicken-egg-ioctl-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-socket chicken-egg-ioctl chicken-egg-defstruct-cross chicken-egg-socket-cross chicken-egg-ioctl-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-socket chicken-egg-ioctl"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tun/tun-${PV}.tar.gz"

SRC_URI[md5sum] = "c781717b180223e3b5fb2d96d76eeea5"
SRC_URI[sha256sum] = "86e630aea73a1571d136bf1f4b140bdc293601e327a73eb0dea3d8b6c35b6be6"

S = "${WORKDIR}/tun-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
